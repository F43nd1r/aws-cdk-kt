package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.WorkloadIdentity
import software.amazon.awscdk.services.bedrockagentcore.WorkloadIdentityProps
import software.constructs.Construct

@Generated
public fun Construct.workloadIdentity(id: String, initializer: @AwsCdkDsl WorkloadIdentity.() -> Unit = {}): WorkloadIdentity = WorkloadIdentity(this, id).apply(initializer)

@Generated
public fun Construct.workloadIdentity(
  id: String,
  props: WorkloadIdentityProps,
  initializer: @AwsCdkDsl WorkloadIdentity.() -> Unit = {},
): WorkloadIdentity = WorkloadIdentity(this, id, props).apply(initializer)

@Generated
public fun Construct.buildWorkloadIdentity(id: String, initializer: @AwsCdkDsl WorkloadIdentity.Builder.() -> Unit = {}): WorkloadIdentity = WorkloadIdentity.Builder.create(this, id).apply(initializer).build()
