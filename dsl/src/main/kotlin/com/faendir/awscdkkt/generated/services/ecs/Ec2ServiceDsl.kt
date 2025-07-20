package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.Ec2Service
import software.amazon.awscdk.services.ecs.Ec2ServiceProps
import software.constructs.Construct

@Generated
public fun Construct.ec2Service(
  id: String,
  props: Ec2ServiceProps,
  initializer: @AwsCdkDsl Ec2Service.() -> Unit = {},
): Ec2Service = Ec2Service(this, id, props).apply(initializer)

@Generated
public fun Construct.buildEc2Service(id: String, initializer: @AwsCdkDsl Ec2Service.Builder.() -> Unit = {}): Ec2Service = Ec2Service.Builder.create(this, id).apply(initializer).build()
