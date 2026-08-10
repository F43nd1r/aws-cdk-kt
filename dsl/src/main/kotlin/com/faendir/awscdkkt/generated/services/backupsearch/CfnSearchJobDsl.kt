package com.faendir.awscdkkt.generated.services.backupsearch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.backupsearch.CfnSearchJob
import software.amazon.awscdk.services.backupsearch.CfnSearchJobProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSearchJob(
  id: String,
  props: CfnSearchJobProps,
  initializer: @AwsCdkDsl CfnSearchJob.() -> Unit = {},
): CfnSearchJob = CfnSearchJob(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSearchJob(id: String, initializer: @AwsCdkDsl CfnSearchJob.Builder.() -> Unit = {}): CfnSearchJob = CfnSearchJob.Builder.create(this, id).apply(initializer).build()
