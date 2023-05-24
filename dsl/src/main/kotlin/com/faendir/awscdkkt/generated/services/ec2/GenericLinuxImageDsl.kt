package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.ec2.GenericLinuxImage
import software.amazon.awscdk.services.ec2.GenericLinuxImageProps

@Generated
public fun genericLinuxImage(amiMap: Map<String, String>): GenericLinuxImage =
    GenericLinuxImage(amiMap)

@Generated
public fun genericLinuxImage(amiMap: Map<String, String>, props: GenericLinuxImageProps):
    GenericLinuxImage = GenericLinuxImage(amiMap, props)

@Generated
public fun buildGenericLinuxImage(amiMap: Map<String, String>, initializer: @AwsCdkDsl
    GenericLinuxImage.Builder.() -> Unit): GenericLinuxImage =
    GenericLinuxImage.Builder.create(amiMap).apply(initializer).build()
