package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public
    fun subjectAlternativeNameMatchersProperty(initializer: CfnVirtualNode.SubjectAlternativeNameMatchersProperty.Builder.() -> Unit
    = {}): CfnVirtualNode.SubjectAlternativeNameMatchersProperty =
    CfnVirtualNode.SubjectAlternativeNameMatchersProperty.builder().apply(initializer).build()
