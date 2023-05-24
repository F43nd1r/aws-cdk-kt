package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnKeyPair
import software.amazon.awscdk.services.ec2.CfnKeyPairProps
import software.constructs.Construct

@Generated
public fun Construct.cfnKeyPair(id: String, props: CfnKeyPairProps): CfnKeyPair = CfnKeyPair(this,
    id, props)

@Generated
public fun Construct.cfnKeyPair(
  id: String,
  props: CfnKeyPairProps,
  initializer: @AwsCdkDsl CfnKeyPair.() -> Unit,
): CfnKeyPair = CfnKeyPair(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnKeyPair(id: String, initializer: @AwsCdkDsl
    CfnKeyPair.Builder.() -> Unit): CfnKeyPair = CfnKeyPair.Builder.create(this,
    id).apply(initializer).build()
