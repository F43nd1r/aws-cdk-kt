package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CodeCommitSourceProps

@Generated
public fun codeCommitSourceProps(initializer: CodeCommitSourceProps.Builder.() -> Unit = {}):
    CodeCommitSourceProps = CodeCommitSourceProps.builder().apply(initializer).build()
