package com.faendir.awscdkkt.generated.services.stepfunctions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.FileDefinitionBody

@Generated
public fun buildFileDefinitionBody(path: String, initializer: @AwsCdkDsl
    FileDefinitionBody.Builder.() -> Unit = {}): FileDefinitionBody =
    FileDefinitionBody.Builder.create(path).apply(initializer).build()
