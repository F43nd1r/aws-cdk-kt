@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnCluster

public
    fun scriptBootstrapActionConfigProperty(initializer: CfnCluster.ScriptBootstrapActionConfigProperty.Builder.() -> Unit):
    CfnCluster.ScriptBootstrapActionConfigProperty =
    CfnCluster.ScriptBootstrapActionConfigProperty.builder().apply(initializer).build()
