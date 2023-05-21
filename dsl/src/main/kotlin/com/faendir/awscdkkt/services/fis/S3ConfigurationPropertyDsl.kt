package com.faendir.awscdkkt.services.fis

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fis.CfnExperimentTemplate

@Generated
public
    fun s3ConfigurationProperty(initializer: CfnExperimentTemplate.S3ConfigurationProperty.Builder.() -> Unit
    = {}): CfnExperimentTemplate.S3ConfigurationProperty =
    CfnExperimentTemplate.S3ConfigurationProperty.builder().apply(initializer).build()
