package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig
import software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfigProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNotebookInstanceLifecycleConfig(id: String):
    CfnNotebookInstanceLifecycleConfig = CfnNotebookInstanceLifecycleConfig(this, id)

@Generated
public fun Construct.cfnNotebookInstanceLifecycleConfig(id: String, initializer: @AwsCdkDsl
    CfnNotebookInstanceLifecycleConfig.() -> Unit): CfnNotebookInstanceLifecycleConfig =
    CfnNotebookInstanceLifecycleConfig(this, id).apply(initializer)

@Generated
public fun Construct.cfnNotebookInstanceLifecycleConfig(id: String,
    props: CfnNotebookInstanceLifecycleConfigProps): CfnNotebookInstanceLifecycleConfig =
    CfnNotebookInstanceLifecycleConfig(this, id, props)

@Generated
public fun Construct.cfnNotebookInstanceLifecycleConfig(
  id: String,
  props: CfnNotebookInstanceLifecycleConfigProps,
  initializer: @AwsCdkDsl CfnNotebookInstanceLifecycleConfig.() -> Unit,
): CfnNotebookInstanceLifecycleConfig = CfnNotebookInstanceLifecycleConfig(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnNotebookInstanceLifecycleConfig(id: String, initializer: @AwsCdkDsl
    CfnNotebookInstanceLifecycleConfig.Builder.() -> Unit): CfnNotebookInstanceLifecycleConfig =
    CfnNotebookInstanceLifecycleConfig.Builder.create(this, id).apply(initializer).build()
