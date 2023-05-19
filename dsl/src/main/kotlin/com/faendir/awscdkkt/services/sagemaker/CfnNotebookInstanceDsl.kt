@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnNotebookInstance
import software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps
import software.constructs.Construct

public fun Construct.cfnNotebookInstance(
  id: String,
  props: CfnNotebookInstanceProps,
  initializer: CfnNotebookInstance.() -> Unit = {},
): CfnNotebookInstance = CfnNotebookInstance(this, id, props).apply(initializer)
