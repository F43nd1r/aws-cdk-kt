package com.faendir.awscdkkt.generated.services.datazone

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datazone.CfnPolicyGrant
import software.amazon.awscdk.services.datazone.CfnPolicyGrantProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPolicyGrant(
  id: String,
  props: CfnPolicyGrantProps,
  initializer: @AwsCdkDsl CfnPolicyGrant.() -> Unit = {},
): CfnPolicyGrant = CfnPolicyGrant(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPolicyGrant(id: String, initializer: @AwsCdkDsl CfnPolicyGrant.Builder.() -> Unit = {}): CfnPolicyGrant = CfnPolicyGrant.Builder.create(this, id).apply(initializer).build()
