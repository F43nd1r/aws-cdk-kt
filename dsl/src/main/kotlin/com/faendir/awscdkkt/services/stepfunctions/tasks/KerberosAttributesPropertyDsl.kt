package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@Generated
public
    fun kerberosAttributesProperty(initializer: EmrCreateCluster.KerberosAttributesProperty.Builder.() -> Unit
    = {}): EmrCreateCluster.KerberosAttributesProperty =
    EmrCreateCluster.KerberosAttributesProperty.builder().apply(initializer).build()
