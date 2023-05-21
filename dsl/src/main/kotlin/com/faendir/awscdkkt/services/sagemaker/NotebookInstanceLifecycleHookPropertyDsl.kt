package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig

@Generated
public
    fun notebookInstanceLifecycleHookProperty(initializer: CfnNotebookInstanceLifecycleConfig.NotebookInstanceLifecycleHookProperty.Builder.() -> Unit
    = {}): CfnNotebookInstanceLifecycleConfig.NotebookInstanceLifecycleHookProperty =
    CfnNotebookInstanceLifecycleConfig.NotebookInstanceLifecycleHookProperty.builder().apply(initializer).build()
