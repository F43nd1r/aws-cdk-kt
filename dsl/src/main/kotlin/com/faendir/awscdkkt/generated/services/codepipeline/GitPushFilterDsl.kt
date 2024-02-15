package com.faendir.awscdkkt.generated.services.codepipeline

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.GitPushFilter

@Generated
public fun buildGitPushFilter(initializer: @AwsCdkDsl GitPushFilter.Builder.() -> Unit = {}):
    GitPushFilter = GitPushFilter.Builder().apply(initializer).build()
