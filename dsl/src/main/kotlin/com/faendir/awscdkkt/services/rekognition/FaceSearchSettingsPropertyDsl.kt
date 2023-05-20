@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.rekognition

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rekognition.CfnStreamProcessor

public
    fun faceSearchSettingsProperty(initializer: CfnStreamProcessor.FaceSearchSettingsProperty.Builder.() -> Unit):
    CfnStreamProcessor.FaceSearchSettingsProperty =
    CfnStreamProcessor.FaceSearchSettingsProperty.builder().apply(initializer).build()
