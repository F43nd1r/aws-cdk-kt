package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.WindowsImage
import software.amazon.awscdk.services.ec2.WindowsImageProps
import software.amazon.awscdk.services.ec2.WindowsVersion

@Generated
public fun windowsImage(version: WindowsVersion): WindowsImage = WindowsImage(version)

@Generated
public fun windowsImage(version: WindowsVersion, props: WindowsImageProps): WindowsImage =
    WindowsImage(version, props)

@Generated
public fun buildWindowsImage(version: WindowsVersion, initializer: @AwsCdkDsl
    WindowsImage.Builder.() -> Unit): WindowsImage =
    WindowsImage.Builder.create(version).apply(initializer).build()
