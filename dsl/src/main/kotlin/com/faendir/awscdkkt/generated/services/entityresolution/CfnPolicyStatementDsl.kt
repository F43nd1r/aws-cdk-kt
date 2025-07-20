package com.faendir.awscdkkt.generated.services.entityresolution

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.entityresolution.CfnPolicyStatement
import software.amazon.awscdk.services.entityresolution.CfnPolicyStatementProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPolicyStatement(
  id: String,
  props: CfnPolicyStatementProps,
  initializer: @AwsCdkDsl CfnPolicyStatement.() -> Unit = {},
): CfnPolicyStatement = CfnPolicyStatement(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPolicyStatement(id: String, initializer: @AwsCdkDsl CfnPolicyStatement.Builder.() -> Unit = {}): CfnPolicyStatement = CfnPolicyStatement.Builder.create(this, id).apply(initializer).build()
