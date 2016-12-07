package com.github.funthomas424242.dsl.generator.database

import com.github.funthomas424242.dsl.ahnen.Familienbuch

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class SourcesGenerator{
	
	def static createContent(Familienbuch buch) '''
  <sources>
    <source handle="_VUBKMQTA2XZG1V6QP8" change="1185438865" id="S0002">
      <stitle>World of the Wierd</stitle>
      <sauthor>John Jacob Jinglehiemerschmitt</sauthor>
      <sabbrev>WOTW</sabbrev>
      <noteref hlink="_ac3804a8405171ef666"/>
      <srcattribute type="Book Cover Type" value="Paperback"/>
      <reporef hlink="_a701e99f93e5434f6f3" callno="what-321-ever" medium="Photo"/>
      <reporef hlink="_a701ead12841521cd4d" callno="nothing-0" medium="Manuscript"/>
    </source>
    <source handle="_X5TJQC9JXU4RKT6VAX" change="1328027439" id="S0003">
      <stitle>Import from test2.ged</stitle>
      <noteref hlink="_ac3804a842b21358c97"/>
      <srcattribute type="Creation date" value="24 APR 1999"/>
      <srcattribute type="Generated by" value="ROOTSV 5.01"/>
      <reporef hlink="_a701e99f93e5434f6f3" callno="CA-123-LL-456_Num/ber" medium="Film"/>
    </source>
    <source handle="_b39fe3f390e30bd2b99" change="1234371690" id="S0000">
      <stitle>Baptize registry 1850 - 1867 Great Falls Church</stitle>
      <sauthor>Priests of Great Falls Church 1850 - 1867</sauthor>
      <spubinfo>Microfilm Public Library Great Falls</spubinfo>
      <sabbrev>BR-GFC 1850</sabbrev>
      <noteref hlink="_b39feb55e1173f4a699"/>
      <noteref hlink="_b39fedb8a051544689c"/>
      <objref hlink="_b39fe1cfc1305ac4a21"/>
      <reporef hlink="_b39fe38593f3f8c4f12" callno="32Z-345" medium="Microfilm"/>
    </source>
    <source handle="_c140d4ef77841431905" change="1328027435" id="S0001">
      <stitle>All possible citations</stitle>
      <noteref hlink="_c140d4c29520c92055c"/>
    </source>
  </sources>
	'''
	}