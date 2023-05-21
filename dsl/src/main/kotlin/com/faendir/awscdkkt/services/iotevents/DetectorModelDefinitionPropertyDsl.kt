package com.faendir.awscdkkt.services.iotevents

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

@Generated
public
    fun detectorModelDefinitionProperty(initializer: CfnDetectorModel.DetectorModelDefinitionProperty.Builder.() -> Unit
    = {}): CfnDetectorModel.DetectorModelDefinitionProperty =
    CfnDetectorModel.DetectorModelDefinitionProperty.builder().apply(initializer).build()
