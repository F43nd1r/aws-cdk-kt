package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnNotebookInstance
import software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNotebookInstance(id: String, props: CfnNotebookInstanceProps):
    CfnNotebookInstance = CfnNotebookInstance(this, id, props)

@Generated
public fun Construct.cfnNotebookInstance(
  id: String,
  props: CfnNotebookInstanceProps,
  initializer: @AwsCdkDsl CfnNotebookInstance.() -> Unit,
): CfnNotebookInstance = CfnNotebookInstance(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnNotebookInstance(id: String, initializer: @AwsCdkDsl
    CfnNotebookInstance.Builder.() -> Unit): CfnNotebookInstance =
    CfnNotebookInstance.Builder.create(this, id).apply(initializer).build()
