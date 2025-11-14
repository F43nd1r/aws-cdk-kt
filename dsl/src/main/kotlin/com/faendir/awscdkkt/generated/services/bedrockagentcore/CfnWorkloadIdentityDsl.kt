package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.CfnWorkloadIdentity
import software.amazon.awscdk.services.bedrockagentcore.CfnWorkloadIdentityProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWorkloadIdentity(
  id: String,
  props: CfnWorkloadIdentityProps,
  initializer: @AwsCdkDsl CfnWorkloadIdentity.() -> Unit = {},
): CfnWorkloadIdentity = CfnWorkloadIdentity(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnWorkloadIdentity(id: String, initializer: @AwsCdkDsl CfnWorkloadIdentity.Builder.() -> Unit = {}): CfnWorkloadIdentity = CfnWorkloadIdentity.Builder.create(this, id).apply(initializer).build()
