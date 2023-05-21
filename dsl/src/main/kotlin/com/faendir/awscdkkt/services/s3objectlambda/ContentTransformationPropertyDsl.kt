package com.faendir.awscdkkt.services.s3objectlambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint

@Generated
public
    fun contentTransformationProperty(initializer: CfnAccessPoint.ContentTransformationProperty.Builder.() -> Unit
    = {}): CfnAccessPoint.ContentTransformationProperty =
    CfnAccessPoint.ContentTransformationProperty.builder().apply(initializer).build()
