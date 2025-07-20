package com.faendir.awscdkkt.generated.services.iottwinmaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iottwinmaker.CfnSyncJob
import software.amazon.awscdk.services.iottwinmaker.CfnSyncJobProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSyncJob(
  id: String,
  props: CfnSyncJobProps,
  initializer: @AwsCdkDsl CfnSyncJob.() -> Unit = {},
): CfnSyncJob = CfnSyncJob(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSyncJob(id: String, initializer: @AwsCdkDsl CfnSyncJob.Builder.() -> Unit = {}): CfnSyncJob = CfnSyncJob.Builder.create(this, id).apply(initializer).build()
