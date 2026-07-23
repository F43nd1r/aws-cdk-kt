package com.faendir.awscdkkt.generated.services.securityagent

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.securityagent.CfnSecurityRequirementPack
import software.amazon.awscdk.services.securityagent.CfnSecurityRequirementPackProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSecurityRequirementPack(
  id: String,
  props: CfnSecurityRequirementPackProps,
  initializer: @AwsCdkDsl CfnSecurityRequirementPack.() -> Unit = {},
): CfnSecurityRequirementPack = CfnSecurityRequirementPack(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSecurityRequirementPack(id: String, initializer: @AwsCdkDsl CfnSecurityRequirementPack.Builder.() -> Unit = {}): CfnSecurityRequirementPack = CfnSecurityRequirementPack.Builder.create(this, id).apply(initializer).build()
