package com.faendir.awscdkkt.generated.services.signer

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.signer.CfnSigningJob
import software.amazon.awscdk.services.signer.CfnSigningJobProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSigningJob(
  id: String,
  props: CfnSigningJobProps,
  initializer: @AwsCdkDsl CfnSigningJob.() -> Unit = {},
): CfnSigningJob = CfnSigningJob(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSigningJob(id: String, initializer: @AwsCdkDsl CfnSigningJob.Builder.() -> Unit = {}): CfnSigningJob = CfnSigningJob.Builder.create(this, id).apply(initializer).build()
