package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.ec2.GenericWindowsImage

@Generated
public fun buildGenericWindowsImage(amiMap: Map<String, String>, initializer: @AwsCdkDsl
    GenericWindowsImage.Builder.() -> Unit): GenericWindowsImage =
    GenericWindowsImage.Builder.create(amiMap).apply(initializer).build()
