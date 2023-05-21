package com.faendir.awscdkkt.services.codepipeline.actions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsDeployActionProps

@Generated
public
    fun codeDeployEcsDeployActionProps(initializer: CodeDeployEcsDeployActionProps.Builder.() -> Unit
    = {}): CodeDeployEcsDeployActionProps =
    CodeDeployEcsDeployActionProps.builder().apply(initializer).build()
