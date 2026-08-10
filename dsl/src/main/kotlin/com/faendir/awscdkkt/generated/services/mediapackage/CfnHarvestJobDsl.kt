package com.faendir.awscdkkt.generated.services.mediapackage

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediapackage.CfnHarvestJob
import software.amazon.awscdk.services.mediapackage.CfnHarvestJobProps
import software.constructs.Construct

@Generated
public fun Construct.cfnHarvestJob(
  id: String,
  props: CfnHarvestJobProps,
  initializer: @AwsCdkDsl CfnHarvestJob.() -> Unit = {},
): CfnHarvestJob = CfnHarvestJob(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnHarvestJob(id: String, initializer: @AwsCdkDsl CfnHarvestJob.Builder.() -> Unit = {}): CfnHarvestJob = CfnHarvestJob.Builder.create(this, id).apply(initializer).build()
