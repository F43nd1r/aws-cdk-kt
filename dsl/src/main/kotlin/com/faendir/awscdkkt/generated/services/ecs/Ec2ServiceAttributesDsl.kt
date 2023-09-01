package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.Ec2ServiceAttributes

@Generated
public fun buildEc2ServiceAttributes(initializer: @AwsCdkDsl Ec2ServiceAttributes.Builder.() -> Unit
    = {}): Ec2ServiceAttributes = Ec2ServiceAttributes.Builder().apply(initializer).build()
