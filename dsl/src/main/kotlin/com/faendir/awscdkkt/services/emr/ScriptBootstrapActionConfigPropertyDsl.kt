package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnCluster

@Generated
public
    fun scriptBootstrapActionConfigProperty(initializer: CfnCluster.ScriptBootstrapActionConfigProperty.Builder.() -> Unit
    = {}): CfnCluster.ScriptBootstrapActionConfigProperty =
    CfnCluster.ScriptBootstrapActionConfigProperty.builder().apply(initializer).build()
