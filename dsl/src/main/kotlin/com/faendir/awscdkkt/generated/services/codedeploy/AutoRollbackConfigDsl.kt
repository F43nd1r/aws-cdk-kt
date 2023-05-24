package com.faendir.awscdkkt.generated.services.codedeploy

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.AutoRollbackConfig

@Generated
public fun buildAutoRollbackConfig(initializer: @AwsCdkDsl AutoRollbackConfig.Builder.() -> Unit):
    AutoRollbackConfig = AutoRollbackConfig.Builder().apply(initializer).build()
