package com.faendir.awscdkkt.generated.services.codebuild

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnBuildBatch
import software.amazon.awscdk.services.codebuild.CfnBuildBatchProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBuildBatch(id: String, initializer: @AwsCdkDsl CfnBuildBatch.() -> Unit = {}): CfnBuildBatch = CfnBuildBatch(this, id).apply(initializer)

@Generated
public fun Construct.cfnBuildBatch(
  id: String,
  props: CfnBuildBatchProps,
  initializer: @AwsCdkDsl CfnBuildBatch.() -> Unit = {},
): CfnBuildBatch = CfnBuildBatch(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnBuildBatch(id: String, initializer: @AwsCdkDsl CfnBuildBatch.Builder.() -> Unit = {}): CfnBuildBatch = CfnBuildBatch.Builder.create(this, id).apply(initializer).build()
