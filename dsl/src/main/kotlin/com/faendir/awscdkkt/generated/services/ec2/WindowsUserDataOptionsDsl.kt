package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.WindowsUserDataOptions

@Generated
public fun buildWindowsUserDataOptions(initializer: @AwsCdkDsl
    WindowsUserDataOptions.Builder.() -> Unit = {}): WindowsUserDataOptions =
    WindowsUserDataOptions.Builder().apply(initializer).build()
