package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnNotebookInstance

@Generated
public
    fun instanceMetadataServiceConfigurationProperty(initializer: CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty.Builder.() -> Unit
    = {}): CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty =
    CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty.builder().apply(initializer).build()
