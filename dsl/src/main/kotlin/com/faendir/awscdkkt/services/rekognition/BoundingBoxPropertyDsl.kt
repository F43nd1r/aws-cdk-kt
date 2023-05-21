package com.faendir.awscdkkt.services.rekognition

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rekognition.CfnStreamProcessor

@Generated
public
    fun boundingBoxProperty(initializer: CfnStreamProcessor.BoundingBoxProperty.Builder.() -> Unit =
    {}): CfnStreamProcessor.BoundingBoxProperty =
    CfnStreamProcessor.BoundingBoxProperty.builder().apply(initializer).build()
