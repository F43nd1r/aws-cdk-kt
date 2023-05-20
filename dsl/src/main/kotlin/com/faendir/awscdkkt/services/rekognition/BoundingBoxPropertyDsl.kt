@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.rekognition

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rekognition.CfnStreamProcessor

public
    fun boundingBoxProperty(initializer: CfnStreamProcessor.BoundingBoxProperty.Builder.() -> Unit):
    CfnStreamProcessor.BoundingBoxProperty =
    CfnStreamProcessor.BoundingBoxProperty.builder().apply(initializer).build()
