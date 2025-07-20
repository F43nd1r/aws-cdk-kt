package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.CodeBuildStartBuildBatch
import software.amazon.awscdk.services.stepfunctions.tasks.CodeBuildStartBuildBatchProps
import software.constructs.Construct

@Generated
public fun Construct.codeBuildStartBuildBatch(
  id: String,
  props: CodeBuildStartBuildBatchProps,
  initializer: @AwsCdkDsl CodeBuildStartBuildBatch.() -> Unit = {},
): CodeBuildStartBuildBatch = CodeBuildStartBuildBatch(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCodeBuildStartBuildBatch(id: String, initializer: @AwsCdkDsl CodeBuildStartBuildBatch.Builder.() -> Unit = {}): CodeBuildStartBuildBatch = CodeBuildStartBuildBatch.Builder.create(this, id).apply(initializer).build()
