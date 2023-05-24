package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnIPAMPool
import software.amazon.awscdk.services.ec2.CfnIPAMPoolProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIPAMPool(id: String, props: CfnIPAMPoolProps): CfnIPAMPool =
    CfnIPAMPool(this, id, props)

@Generated
public fun Construct.cfnIPAMPool(
  id: String,
  props: CfnIPAMPoolProps,
  initializer: @AwsCdkDsl CfnIPAMPool.() -> Unit,
): CfnIPAMPool = CfnIPAMPool(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnIPAMPool(id: String, initializer: @AwsCdkDsl
    CfnIPAMPool.Builder.() -> Unit): CfnIPAMPool = CfnIPAMPool.Builder.create(this,
    id).apply(initializer).build()
