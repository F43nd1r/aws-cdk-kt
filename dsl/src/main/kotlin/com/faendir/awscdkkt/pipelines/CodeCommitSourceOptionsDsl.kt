@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.pipelines

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.pipelines.CodeCommitSourceOptions

public fun codeCommitSourceOptions(initializer: CodeCommitSourceOptions.Builder.() -> Unit):
    CodeCommitSourceOptions = CodeCommitSourceOptions.builder().apply(initializer).build()
