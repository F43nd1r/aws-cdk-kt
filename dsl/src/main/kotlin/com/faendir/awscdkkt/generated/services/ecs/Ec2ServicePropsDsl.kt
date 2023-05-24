package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.Ec2ServiceProps

@Generated
public fun buildEc2ServiceProps(initializer: @AwsCdkDsl Ec2ServiceProps.Builder.() -> Unit):
    Ec2ServiceProps = Ec2ServiceProps.Builder().apply(initializer).build()
