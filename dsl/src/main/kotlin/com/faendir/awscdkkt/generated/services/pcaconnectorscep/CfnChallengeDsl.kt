package com.faendir.awscdkkt.generated.services.pcaconnectorscep

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pcaconnectorscep.CfnChallenge
import software.amazon.awscdk.services.pcaconnectorscep.CfnChallengeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnChallenge(
  id: String,
  props: CfnChallengeProps,
  initializer: @AwsCdkDsl CfnChallenge.() -> Unit = {},
): CfnChallenge = CfnChallenge(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnChallenge(id: String, initializer: @AwsCdkDsl CfnChallenge.Builder.() -> Unit = {}): CfnChallenge = CfnChallenge.Builder.create(this, id).apply(initializer).build()
