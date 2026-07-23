package com.faendir.awscdkkt.generated.services.quicksight

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnAssetBundleExportJob
import software.amazon.awscdk.services.quicksight.CfnAssetBundleExportJobProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAssetBundleExportJob(
  id: String,
  props: CfnAssetBundleExportJobProps,
  initializer: @AwsCdkDsl CfnAssetBundleExportJob.() -> Unit = {},
): CfnAssetBundleExportJob = CfnAssetBundleExportJob(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAssetBundleExportJob(id: String, initializer: @AwsCdkDsl CfnAssetBundleExportJob.Builder.() -> Unit = {}): CfnAssetBundleExportJob = CfnAssetBundleExportJob.Builder.create(this, id).apply(initializer).build()
