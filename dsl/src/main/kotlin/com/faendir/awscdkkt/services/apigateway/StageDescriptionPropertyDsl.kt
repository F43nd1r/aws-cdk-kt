package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnDeployment

@Generated
public
    fun stageDescriptionProperty(initializer: CfnDeployment.StageDescriptionProperty.Builder.() -> Unit
    = {}): CfnDeployment.StageDescriptionProperty =
    CfnDeployment.StageDescriptionProperty.builder().apply(initializer).build()
