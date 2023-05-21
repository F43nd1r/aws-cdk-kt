package com.faendir.awscdkkt.services.fsx

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnVolume

@Generated
public
    fun ontapConfigurationProperty(initializer: CfnVolume.OntapConfigurationProperty.Builder.() -> Unit
    = {}): CfnVolume.OntapConfigurationProperty =
    CfnVolume.OntapConfigurationProperty.builder().apply(initializer).build()
