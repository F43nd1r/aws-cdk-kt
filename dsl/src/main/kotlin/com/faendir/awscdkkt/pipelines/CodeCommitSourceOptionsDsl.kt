@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.pipelines

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.pipelines.CodeCommitSourceOptions

public fun codeCommitSourceOptions(initializer: CodeCommitSourceOptions.Builder.() -> Unit):
    CodeCommitSourceOptions = CodeCommitSourceOptions.builder().apply(initializer).build()
