package com.faendir.awscdkkt.generated.pipelines

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.pipelines.CodeCommitSourceOptions

@Generated
public fun buildCodeCommitSourceOptions(initializer: @AwsCdkDsl
    CodeCommitSourceOptions.Builder.() -> Unit = {}): CodeCommitSourceOptions =
    CodeCommitSourceOptions.Builder().apply(initializer).build()
