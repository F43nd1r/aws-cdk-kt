package com.faendir.awscdkkt.generated.services.quicksight

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnAssetBundleImportJob
import software.amazon.awscdk.services.quicksight.CfnAssetBundleImportJobProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAssetBundleImportJob(
  id: String,
  props: CfnAssetBundleImportJobProps,
  initializer: @AwsCdkDsl CfnAssetBundleImportJob.() -> Unit = {},
): CfnAssetBundleImportJob = CfnAssetBundleImportJob(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAssetBundleImportJob(id: String, initializer: @AwsCdkDsl CfnAssetBundleImportJob.Builder.() -> Unit = {}): CfnAssetBundleImportJob = CfnAssetBundleImportJob.Builder.create(this, id).apply(initializer).build()
