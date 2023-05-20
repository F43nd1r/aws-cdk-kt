@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.rekognition

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rekognition.CfnStreamProcessor

public
    fun boundingBoxProperty(initializer: CfnStreamProcessor.BoundingBoxProperty.Builder.() -> Unit):
    CfnStreamProcessor.BoundingBoxProperty =
    CfnStreamProcessor.BoundingBoxProperty.builder().apply(initializer).build()
