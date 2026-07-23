package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelCardExportJob
import software.amazon.awscdk.services.sagemaker.CfnModelCardExportJobProps
import software.constructs.Construct

@Generated
public fun Construct.cfnModelCardExportJob(
  id: String,
  props: CfnModelCardExportJobProps,
  initializer: @AwsCdkDsl CfnModelCardExportJob.() -> Unit = {},
): CfnModelCardExportJob = CfnModelCardExportJob(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnModelCardExportJob(id: String, initializer: @AwsCdkDsl CfnModelCardExportJob.Builder.() -> Unit = {}): CfnModelCardExportJob = CfnModelCardExportJob.Builder.create(this, id).apply(initializer).build()
