@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig
import software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfigProps
import software.constructs.Construct

public fun Construct.cfnNotebookInstanceLifecycleConfig(
  id: String,
  props: CfnNotebookInstanceLifecycleConfigProps,
  initializer: CfnNotebookInstanceLifecycleConfig.() -> Unit = {},
): CfnNotebookInstanceLifecycleConfig = CfnNotebookInstanceLifecycleConfig(this, id,
    props).apply(initializer)

public fun Construct.cfnNotebookInstanceLifecycleConfig(id: String,
    initializer: CfnNotebookInstanceLifecycleConfig.() -> Unit = {}):
    CfnNotebookInstanceLifecycleConfig = CfnNotebookInstanceLifecycleConfig(this,
    id).apply(initializer)
