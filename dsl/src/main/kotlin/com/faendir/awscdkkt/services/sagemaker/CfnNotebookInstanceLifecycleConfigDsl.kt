package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig
import software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfigProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNotebookInstanceLifecycleConfig(id: String,
    initializer: CfnNotebookInstanceLifecycleConfig.() -> Unit = {}):
    CfnNotebookInstanceLifecycleConfig = CfnNotebookInstanceLifecycleConfig(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnNotebookInstanceLifecycleConfig(
  id: String,
  props: CfnNotebookInstanceLifecycleConfigProps,
  initializer: CfnNotebookInstanceLifecycleConfig.() -> Unit = {},
): CfnNotebookInstanceLifecycleConfig = CfnNotebookInstanceLifecycleConfig(this, id,
    props).apply(initializer)
