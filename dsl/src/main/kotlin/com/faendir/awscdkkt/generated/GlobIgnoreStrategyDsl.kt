package com.faendir.awscdkkt.generated

import javax.`annotation`.Generated
import kotlin.String
import kotlin.collections.List
import software.amazon.awscdk.GlobIgnoreStrategy

@Generated
public fun globIgnoreStrategy(absoluteRootPath: String, patterns: List<String>): GlobIgnoreStrategy
    = GlobIgnoreStrategy(absoluteRootPath, patterns)
