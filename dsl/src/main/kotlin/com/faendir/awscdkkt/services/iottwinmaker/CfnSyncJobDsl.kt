@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
