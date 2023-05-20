@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.iottwinmaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iottwinmaker.CfnSyncJob
import software.amazon.awscdk.services.iottwinmaker.CfnSyncJobProps
import software.constructs.Construct

public fun Construct.cfnSyncJob(
  id: String,
  props: CfnSyncJobProps,
  initializer: CfnSyncJob.() -> Unit = {},
): CfnSyncJob = CfnSyncJob(this, id, props).apply(initializer)
