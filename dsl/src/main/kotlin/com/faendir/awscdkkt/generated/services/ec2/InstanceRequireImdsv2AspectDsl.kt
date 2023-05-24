package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.InstanceRequireImdsv2Aspect

@Generated
public fun buildInstanceRequireImdsv2Aspect(initializer: @AwsCdkDsl
    InstanceRequireImdsv2Aspect.Builder.() -> Unit): InstanceRequireImdsv2Aspect =
    InstanceRequireImdsv2Aspect.Builder.create().apply(initializer).build()
